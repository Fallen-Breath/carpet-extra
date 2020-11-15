package carpetextra;

import carpet.CarpetExtension;
import carpet.CarpetServer;
import carpet.CarpetSettings;
import carpet.settings.ParsedRule;
import carpet.settings.SettingsManager;
import carpet.settings.Validator;
import carpet.utils.Translations;
import carpetextra.commands.PingCommand;
import carpetextra.utils.CarpetExtraTranslations;
import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;

import java.io.PrintStream;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CarpetExtraServer implements CarpetExtension
{
    @Override
    public String version()
    {
        return "carpet-extra";
    }

    public static void noop() { }

    static
    {
        CarpetServer.manageExtension(new CarpetExtraServer());
        // temporary until CM proper runs tiny bit later
        //CarpetServer.settingsManager.parseSettingsClass(CarpetExtraSettings.class);
    }

    @Override
    public void onGameStarted()
    {
        // let's /carpet handle our few simple settings
        CarpetServer.settingsManager.parseSettingsClass(CarpetExtraSettings.class);

        // set-up a snooper to observe how rules are changing in carpet
        CarpetServer.settingsManager.addRuleObserver( (serverCommandSource, currentRuleState, originalUserTest) ->
        {
            // here we will be snooping for command changes
        });
    }

    @Override
    public void onServerLoaded(MinecraftServer server)
    {
        // reloading of /carpet settings is handled by carpet
        // reloading of own settings is handled as an extension, since we claim own settings manager
        // in case something else falls into
    }

    @Override
    public void onTick(MinecraftServer server)
    {
        // maybe, maybe
    }

    @Override
    public void registerCommands(CommandDispatcher<ServerCommandSource> dispatcher)
    {
        // here goes extra stuff
        PingCommand.register(dispatcher);
    }

    @Override
    public void onPlayerLoggedIn(ServerPlayerEntity player)
    {
         // will need that for client features
    }

    @Override
    public void onPlayerLoggedOut(ServerPlayerEntity player)
    {
        // will need that for client features
    }

    @Override
    public Map<String, String> canHasTranslations(String lang)
    {
        return CarpetExtraTranslations.getTranslationFromResourcePath(lang);
    }

    public static int printAllRulesToLog(String category)
    {
        CarpetSettings.language = "zh_cn";
        Translations.updateLanguage(null);
        PrintStream ps = System.out;
        ps.println("# Carpet Extra 设置");
        for (ParsedRule<?> rule : CarpetServer.settingsManager.getRules())
        {
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
