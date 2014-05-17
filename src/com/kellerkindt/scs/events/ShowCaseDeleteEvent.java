/**
* ShowCaseStandalone
* Copyright (C) 2012 Kellerkindt <copyright at kellerkindt.com>
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
package com.kellerkindt.scs.events;

import org.bukkit.entity.Player;

import com.kellerkindt.scs.shops.Shop;

/**
* This Event tries to delete the given shop
* @author kellerkindt <michael at kellerkindt.com>
*/
public class ShowCaseDeleteEvent extends ShowCaseShopEvent {
	
	
	public ShowCaseDeleteEvent (Player player, Shop shop) {
		super(player, shop);
	}
	
}