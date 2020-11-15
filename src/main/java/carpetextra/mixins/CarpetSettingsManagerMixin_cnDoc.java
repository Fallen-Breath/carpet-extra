package carpetextra.mixins;

import carpet.CarpetSettings;
import carpet.settings.ParsedRule;
import carpet.settings.SettingsManager;
import carpet.settings.Validator;
import carpet.utils.Translations;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

import java.io.PrintStream;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

@Mixin(SettingsManager.class)
public class CarpetSettingsManagerMixin_cnDoc
{
	@Shadow(remap = false) @Final private String fancyName;

	@Shadow(remap = false) private Map<String, ParsedRule<?>> rules;

	/**
	 * @author Fallen_Breath
	 * @reason cn doc
	 */
	@Overwrite(remap = false)
	public int printAllRulesToLog(String category)
	{
		CarpetSettings.language = "zh_cn";
		Translations.updateLanguage(null);
		PrintStream ps = System.out;
		ps.println("# " + this.fancyName + " 设置");
		for (Map.Entry<String, ParsedRule<?>> e : new TreeMap<>(this.rules).entrySet())
		{
			ParsedRule<?> rule = e.getValue();
			if (category != null && !rule.categories.contains(category))
				continue;
			ps.println("## " + rule.translatedName());
			ps.println(rule.translatedDescription() + "  ");
			for (String extra : rule.translatedExtras())
				ps.println(extra + "  ");
			ps.println("* 类型: `" + rule.type.getSimpleName() + "`  ");
			ps.println("* 默认值: `" + rule.defaultAsString + "`  ");
			String optionString = rule.options.stream().map(s -> "`" + s + "`").collect(Collectors.joining(", "));
			ps.println((rule.isStrict ? "* 要求" : "* 建议") + "选项: " + optionString + "  ");
			ps.println("* 分类: " + rule.categories.stream().map(s -> "`" + s.toUpperCase(Locale.ROOT) + "`").collect(Collectors.joining(", ")) + "  ");
			boolean preamble = false;
			for (Validator<?> validator : rule.validators)
			{
				if (validator.description() != null)
				{
					if (!preamble)
					{
						ps.println("* 附加说明:  ");
						preamble = true;
					}
					ps.println("  * " + validator.description() + "  ");
				}
			}
			ps.println("  ");
		}
		return 1;
	}
}
