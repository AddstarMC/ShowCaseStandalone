/**
* ShowCaseStandalone
* Copyright (C) 2014 Kellerkindt <copyright at kellerkindt.com>
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 2 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program. If not, see <http://www.gnu.org/licenses/>.
*/
package com.kellerkindt.scs.commands;

import java.util.List;
import java.util.logging.Level;

import org.bukkit.command.CommandSender;

import com.kellerkindt.scs.ShowCaseStandalone;

/**
 *
 * @author michael <michael at kellerkindt.com>
 */
public class Last extends SimpleCommand {
	
	public Last (ShowCaseStandalone scs, String ... permissions) {
		super(scs, permissions);
	}

	@Override
	public List<String> getTabCompletions(CommandSender sender, String[] args) {
		// nothing to do (yet)
		return null;
	}

	@Override
	public void execute(CommandSender sender, String[] args) throws CommandException {
		// TODO show last transactions

        scs.log(Level.INFO, "Somone performed '/scs undo' which isn't implemented yet", false);
        scs.sendMessage(sender, "Not implemented yet");
	}

}