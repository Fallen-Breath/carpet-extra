# carpet-extra

为 Carpet Mod 添加更多的特性

和相同 Minecraft 版本的 [fabric-carpet](https://github.com/gnembon/fabric-carpet) 一起使用

由于 autoCraftingTable 特性的实现方式可能会带来一些兼容性问题，这个特性被移动到了[一个独立的扩展中](https://github.com/gnembon/carpet-autoCraftingTable)

# Carpet Extra 特性

## 准确方块放置支持 (accurateBlockPlacement)
启用对tweakroo mod的tweakAccurateBlockPlacement选项的支持  
* 类型: `boolean`  
* 默认值: `false`  
* 要求选项: `true`, `false`  
* 分类: `EXTRAS`, `SURVIVAL`  
  
## 投掷器自动合成 (autoCraftingDropper)
指向工作台的投掷器可以合成物品  
当一个投掷器指向工作台时，若该投掷器的3x3空间中存在一个合法的配方，  
则在它被激活时，它会合成这个配方，并丢出产物  
对于这类指向工作台的投掷器，它们输出比较器信号的逻辑被修改，信号强度与被填充的格子数量相关  
除此之外，当使用漏斗、投掷器以及发射器向它们输入时，它们每个槽位最多仅接受一个物品  
* 类型: `boolean`  
* 默认值: `false`  
* 要求选项: `true`, `false`  
* 分类: `CREATIVE`, `EXTRAS`, `DISPENSER`  
  
## 更好的骨粉 (betterBonemeal)
骨粉可被用于催熟仙人掌及甘蔗  
* 类型: `boolean`  
* 默认值: `false`  
* 要求选项: `true`, `false`  
* 分类: `FEATURE`, `EXTRAS`, `SURVIVAL`  
  
## 烈焰棒肥料 (blazeMeal)
烈焰棒可以催熟下界疣  
可通过发射器或玩家右键动作来催熟  
* 类型: `boolean`  
* 默认值: `false`  
* 要求选项: `true`, `false`  
* 分类: `EXTRAS`, `FEATURE`, `SURVIVAL`  
  
## 方块状态同步 (blockStateSyncing)
修复F3调试界面中某些方块的方块状态不被更新  
可能会增加网络负载  
影响方块：仙人掌、甘蔗、树苗、漏斗、发射器以及投掷器  
* 类型: `boolean`  
* 默认值: `false`  
* 要求选项: `true`, `false`  
* 分类: `EXTRAS`, `EXPERIMENTAL`  
  
## 剪鸡毛 (chickenShearing)
你可以用剪刀从鸡的身上剪下羽毛。注意！每次你剪鸡毛时鸡都会受伤！  
未成年的鸡不能被剪下羽毛  
* 类型: `boolean`  
* 默认值: `false`  
* 要求选项: `true`, `false`  
* 分类: `EXTRAS`, `FEATURE`  
  
## 牧师收获下界疣 (clericsFarmWarts)
让牧师可以收获下界疣  
同时这也会让它们能够捡起下界疣物品  
以及让它们寻路至灵魂沙  
* 类型: `boolean`  
* 默认值: `false`  
* 要求选项: `true`, `false`  
* 分类: `EXTRAS`, `FEATURE`  
  
## 延迟测试 (commandPing)
启用`/ping`命令让玩家可获得他们的网络延迟  
* 类型: `boolean`  
* 默认值: `true`  
* 要求选项: `true`, `false`  
* 分类: `COMMAND`, `EXTRAS`  
* 附加说明:  
  * It has an accompanying command  
  
## 比较器读取时钟 (comparatorReadsClock)
让比较器读取展示框内钟的时间，而非钟物品在展示框中的旋转角度  
* 类型: `boolean`  
* 默认值: `false`  
* 要求选项: `true`, `false`  
* 分类: `FEATURE`, `EXTRAS`, `EXPERIMENTAL`  
  
## 爬行者于雪屋生成 (creeperSpawningInJungleTemples)
雪屋中能且仅能生成爬行者  
* 类型: `boolean`  
* 默认值: `false`  
* 要求选项: `true`, `false`  
* 分类: `FEATURE`, `EXTRAS`  
  
## 禁用玩家碰撞 (disablePlayerCollision)
禁用玩家实体的碰撞  
* 类型: `boolean`  
* 默认值: `false`  
* 要求选项: `true`, `false`  
* 分类: `EXTRAS`, `CREATIVE`, `EXPERIMENTAL`  
  
## 发射器放置方块 (dispenserPlacesBlocks)
发射器可放置方块  
* 类型: `boolean`  
* 默认值: `false`  
* 要求选项: `true`, `false`  
* 分类: `CREATIVE`, `EXTRAS`, `DISPENSER`  
  
## 发射器雕刻南瓜 (dispensersCarvePumpkins)
含有剪刀的发射器可以雕刻南瓜  
* 类型: `boolean`  
* 默认值: `false`  
* 要求选项: `true`, `false`  
* 分类: `EXTRAS`, `FEATURE`, `DISPENSER`  
  
## 发射器喂食动物 (dispensersFeedAnimals)
发射器可喂食动物  
* 类型: `boolean`  
* 默认值: `false`  
* 要求选项: `true`, `false`  
* 分类: `EXTRAS`, `EXPERIMENTAL`, `FEATURE`, `DISPENSER`  
  
## 发射器组装矿车 (dispensersFillMinecarts)
发射器可将漏斗、箱子、TNT以及熔炉放入矿车中  
* 类型: `boolean`  
* 默认值: `false`  
* 要求选项: `true`, `false`  
* 分类: `EXPERIMENTAL`, `FEATURE`, `EXTRAS`, `DISPENSER`  
  
## 发射器挤奶 (dispensersMilkCows)
发射器可使用空桶给牛挤奶，也可以使用碗给蘑菇牛挤蘑菇煲  
* 类型: `boolean`  
* 默认值: `false`  
* 要求选项: `true`, `false`  
* 分类: `EXPERIMENTAL`, `EXTRAS`, `FEATURE`, `DISPENSER`  
  
## 发射器播放唱片 (dispensersPlayRecords)
发射器可以使用其前方的唱片机播放唱片  
如果唱片机中已存在唱片，已存在的唱片将会被放回投掷器中  
* 类型: `boolean`  
* 默认值: `false`  
* 要求选项: `true`, `false`  
* 分类: `EXTRAS`, `FEATURE`, `DISPENSER`  
  
## 发射器锄地 (dispensersTillSoil)
发射器可使用锄来锄地  
* 类型: `boolean`  
* 默认值: `false`  
* 要求选项: `true`, `false`  
* 分类: `EXTRAS`, `FEATURE`, `DISPENSER`  
  
## 发射器拨动方块 (dispensersToggleThings)
含有木棍的发射器可以拨动各种方块  
对按钮、红石粉、音符盒、红石比较器、红石中继器以及阳光传感器等有效  
* 类型: `boolean`  
* 默认值: `false`  
* 要求选项: `true`, `false`  
* 分类: `EXTRAS`, `EXPERIMENTAL`, `FEATURE`, `DISPENSER`  
  
## 活塞双重收回 (doubleRetraction)
重新实现1.8版本中活塞的双重收回  
让活塞无副作用地得到双重收回的能力  
* 类型: `boolean`  
* 默认值: `false`  
* 要求选项: `true`, `false`  
* 分类: `EXTRAS`, `EXPERIMENTAL`  
  
## 龙蛋破基岩 (dragonEggBedrockBreaking)
重新引入1.12的龙蛋破基岩机制  
* 类型: `boolean`  
* 默认值: `false`  
* 要求选项: `true`, `false`  
* 分类: `EXTRAS`, `EXPERIMENTAL`  
  
## 龙息转换圆石至末地石 (dragonsBreathConvertsCobbleToEndstone)
发射器中的龙息可将圆石转换为末地石  
* 类型: `boolean`  
* 默认值: `false`  
* 要求选项: `true`, `false`  
* 分类: `EXTRAS`, `EXPERIMENTAL`, `DISPENSER`  
  
## 空潜影盒总能堆叠 (emptyShulkerBoxStackAlways)
让空潜影盒总能堆叠起来，包括在物品栏中  
* 类型: `boolean`  
* 默认值: `false`  
* 要求选项: `true`, `false`  
* 分类: `FEATURE`, `EXTRAS`, `EXPERIMENTAL`  
  
## 末影珍珠区块加载 (enderPearlChunkLoading)
让水平移动的末影珍珠可以强加载区块  
* 类型: `boolean`  
* 默认值: `false`  
* 要求选项: `true`, `false`  
* 分类: `FEATURE`, `EXTRAS`  
  
## 烈焰弹转换圆石至下界岩 (fireChargeConvertsToNetherrack)
发射器中的烈焰弹可将圆石转换为下界岩  
感谢：Skyrising  
* 类型: `boolean`  
* 默认值: `false`  
* 要求选项: `true`, `false`  
* 分类: `EXTRAS`, `EXPERIMENTAL`  
  
## 花盆区块加载 (flowerPotChunkLoading)
将凋零玫瑰放置于花盆中以常加载其所在的区块  
如果你启用了这个规则，已存在花盆的区块不会被加载  
如果你关闭了这个规则，处于加载状态的花盆区块不会被移除，你需要手动使用/forceload指令来移除它们  
所有常加载区块的列表可用`/forceload query`查询  
* 类型: `boolean`  
* 默认值: `false`  
* 要求选项: `true`, `false`  
* 分类: `EXTRAS`, `FEATURE`, `EXPERIMENTAL`  
  
## 漏斗矿车8gt冷却 (hopperMinecart8gtCooldown)
让漏斗矿车具有跟漏斗类似的8gt延迟  
* 类型: `boolean`  
* 默认值: `false`  
* 要求选项: `true`, `false`  
* 分类: `BUGFIX`, `FEATURE`, `EXTRAS`, `EXPERIMENTAL`  
  
## 漏斗矿车输出物品 (hopperMinecartItemTransfer)
让漏斗矿车可以向其下方容器输出物品  
* 类型: `boolean`  
* 默认值: `false`  
* 要求选项: `true`, `false`  
* 分类: `BUGFIX`, `FEATURE`, `EXTRAS`, `EXPERIMENTAL`  
  
## 海绵吸水距离 (maxSpongeRange)
海绵吸水的最大偏移距离  
* 类型: `int`  
* 默认值: `7`  
* 建议选项: `7`  
* 分类: `FEATURE`, `EXTRAS`  
  
## 海绵吸水量 (maxSpongeSuck)
海绵的最大吸水量  
* 类型: `int`  
* 默认值: `64`  
* 建议选项: `64`  
* 分类: `FEATURE`, `EXTRAS`  
  
## 着火的生物将沙子转换为灵魂沙 (mobInFireConvertsSandToSoulsand)
当生物死于沙子上的火焰时，沙子将会转换为灵魂沙  
* 类型: `boolean`  
* 默认值: `false`  
* 要求选项: `true`, `false`  
* 分类: `EXTRAS`, `FEATURE`, `EXPERIMENTAL`  
  
## 活塞重定向红石粉 (pistonRedirectsRedstone)
活塞以及粘性活塞可以重定向红石粉指向  
When retracting, they will blink visually  
but that's only to minimize changes required for it to work  
* 类型: `boolean`  
* 默认值: `false`  
* 要求选项: `true`, `false`  
* 分类: `EXTRAS`, `FEATURE`  
  
## 重载窒息修复 (reloadSuffocationFix)
让生物不会在区块重载后卡进方块里  
生物表现可能会有轻微的不同  
修复了[MC-2025](https://bugs.mojang.com/browse/MC-2025)  
* 类型: `boolean`  
* 默认值: `false`  
* 要求选项: `true`, `false`  
* 分类: `EXTRAS`, `BUGFIX`, `EXPERIMENTAL`  
  
## 可再生岩浆 (renewableLava)
被6个岩浆源围绕的黑曜石有概率转换为岩浆  
感谢：Skyrising  
* 类型: `boolean`  
* 默认值: `false`  
* 要求选项: `true`, `false`  
* 分类: `EXTRAS`, `EXPERIMENTAL`, `FEATURE`  
  
## 可再生浮冰 (renewablePackedIce)
掉落的铁砧压碎多个冰块时会将冰转换为浮冰  
* 类型: `boolean`  
* 默认值: `false`  
* 要求选项: `true`, `false`  
* 分类: `EXTRAS`, `EXPERIMENTAL`, `FEATURE`  
  
## 可再生沙子 (renewableSand)
被铁砧砸到的圆石会变成沙子  
* 类型: `boolean`  
* 默认值: `false`  
* 要求选项: `true`, `false`  
* 分类: `EXTRAS`, `EXPERIMENTAL`, `FEATURE`  
  
## 可再生凋灵骷髅 (renewableWitherSkeletons)
被闪电击中的骷髅会转换为凋灵骷髅  
* 类型: `boolean`  
* 默认值: `false`  
* 要求选项: `true`, `false`  
* 分类: `FEATURE`, `EXTRAS`  
  
## 红石中继器优先级修复 (repeaterPriorityFix)
短脉冲不会在某些中继器序列中消失  
可以说是带回了1.8前的表现  
修复了[MC-54711](https://bugs.mojang.com/browse/MC-54711)  
* 类型: `boolean`  
* 默认值: `false`  
* 要求选项: `true`, `false`  
* 分类: `EXTRAS`, `BUGFIX`, `EXPERIMENTAL`  
  
## 脚手架距离上限 (scaffoldingDistance)
脚手架水平扩展的距离上限  
* 类型: `int`  
* 默认值: `7`  
* 建议选项: `2`, `3`, `5`, `7`  
* 分类: `FEATURE`, `EXTRAS`  
* 附加说明:  
  * You must choose a value from 0 to 7  
  
## 蜘蛛骑士掉落附魔金苹果 (spiderJockeysDropGapples)
让骷髅骑士有一定概率掉落附魔金苹果  
默认值为0，即不会掉落附魔金苹果  
* 类型: `int`  
* 默认值: `0`  
* 要求选项: `0`, `50`, `100`  
* 分类: `EXTRAS`, `FEATURE`  
* 附加说明:  
  * You must choose a value from 0 to 100  
  
## 流浪者于雪屋生成 (straySpawningInIgloos)
雪屋中能且仅能生成流浪者  
* 类型: `boolean`  
* 默认值: `false`  
* 要求选项: `true`, `false`  
* 分类: `FEATURE`, `EXTRAS`  
  
## 更新抑制崩服修复 (updateSuppressionCrashFix)
抑制因更新抑制导致的服务器崩溃  
* 类型: `boolean`  
* 默认值: `false`  
* 要求选项: `true`, `false`  
* 分类: `BUGFIX`, `EXTRAS`  
  
## 木质元件可变延迟 (variableWoodDelays)
木质压力板、按钮将因其种类不同而拥有不同的延迟  
* 类型: `boolean`  
* 默认值: `false`  
* 要求选项: `true`, `false`  
* 分类: `EXTRAS`, `FEATURE`  
  
## y0龙蛋破基岩 (y0DragonEggBedrockBreaking)
让龙蛋可破除y0基岩  
需开启dragonEggBedrockBreaking(龙蛋破基岩)规则  
* 类型: `boolean`  
* 默认值: `false`  
* 要求选项: `true`, `false`  
* 分类: `EXPERIMENTAL`, `EXTRAS`  
  


