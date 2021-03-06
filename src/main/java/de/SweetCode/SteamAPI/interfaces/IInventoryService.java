package de.SweetCode.SteamAPI.interfaces;

import de.SweetCode.SteamAPI.SteamAPI;
import de.SweetCode.SteamAPI.method.methods.*;

public class IInventoryService extends SteamInterface {

    public IInventoryService(SteamAPI steam) {
        super(steam, "IInventoryService");

        this.add(new AddItem(this));
        this.add(new AddPromoItem(this));
        this.add(new ExchangeItem(this));
        this.add(new GetInventory(this));
        this.add(new GetItemDefs(this));
        this.add(new GetPriceSheet(this));

    }

}
