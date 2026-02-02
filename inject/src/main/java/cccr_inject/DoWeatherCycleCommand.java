package cccr_inject;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.storage.WorldInfo;

public class DoWeatherCycleCommand extends CommandBase {
	// getCommandName
	@Override
	public String func_71517_b() {
		return "doWeatherCycle";
	}

	// getCommandUsage
	@Override
	public String func_71518_a(ICommandSender sender) {
		return "/doWeatherCycle <true|false>";
	}

	// processCommand
	@Override
	public void func_71515_b(ICommandSender sender, String[] args) {
		if (args.length < 1) {
			return;
		}

		//                    MinecraftServer.getServer   ().worldServers [0].getWorldInfo();
		WorldInfo worldInfo = MinecraftServer.func_71276_C().field_71305_c[0].func_72912_H();

		if (args[0].equalsIgnoreCase("false")) {
			worldInfo.func_76080_g(Integer.MAX_VALUE); // setRainTime
			worldInfo.func_76090_f(Integer.MAX_VALUE); // setThunderTime
			worldInfo.func_76084_b(false); // setRaining
			worldInfo.func_76069_a(false); // setThundering
			func_71522_a(sender, "Disabled weather cycle"); // notifyAdmins
		} else if (args[0].equalsIgnoreCase("true")) {
			worldInfo.func_76080_g(6000); // setRainTime
			worldInfo.func_76090_f(6000); // setThunderTime
		}
	}

	@Override
	public int compareTo(Object o) {
		return 0;
	}
}
