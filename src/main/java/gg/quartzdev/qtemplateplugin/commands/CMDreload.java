package gg.quartzdev.qtemplateplugin.commands;

import gg.quartzdev.qtemplateplugin.util.Messages;
import gg.quartzdev.qtemplateplugin.util.QPerm;
import gg.quartzdev.qtemplateplugin.util.QPlugin;
import gg.quartzdev.qtemplateplugin.util.Sender;
import org.bukkit.command.CommandSender;

public class CMDreload extends QCommand{
    public CMDreload(String name, QPerm permissionGroup) {
        super(name, permissionGroup);
    }

    @Override
    public boolean logic(CommandSender sender, String label, String[] args) {
        QPlugin.getConfig().reload();
        Sender.message(sender, Messages.RELOAD_COMPLETE);
        return false;
    }

    @Override
    public Iterable<String> tabCompletionLogic(CommandSender sender, String[] args) {
        return null;
    }
}
