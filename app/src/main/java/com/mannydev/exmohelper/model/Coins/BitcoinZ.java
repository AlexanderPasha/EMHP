package com.mannydev.exmohelper.model.Coins;

import com.mannydev.exmohelper.model.Coin;
import com.mannydev.exmohelper.model.Pair;

import static com.mannydev.exmohelper.MainActivity.exmo;

/**
 * Created by manny on 08.03.18.
 */

public class BitcoinZ extends Coin {
    public BitcoinZ(Pair btczBtc) {
        super("BTCZ",btczBtc,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null);
    }

    @Override
    public String getRightNowBuyUsdProfit() {
        return null;
    }

    @Override
    public String getRightNowSellUsdProfit() {
        return null;
    }

    @Override
    public String getBestBuyProfit() {
        return null;
    }

    @Override
    public String getBestSellProfit() {
        return null;
    }


}
