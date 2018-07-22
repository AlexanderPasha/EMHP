package com.mannydev.exmohelper.model;

import com.mannydev.exmohelper.model.Coins.Bitcoin;
import com.mannydev.exmohelper.model.Coins.BitcoinCash;
import com.mannydev.exmohelper.model.Coins.Dashcoin;
import com.mannydev.exmohelper.model.Coins.Dogecoin;
import com.mannydev.exmohelper.model.Coins.Eos;
import com.mannydev.exmohelper.model.Coins.Etherium;
import com.mannydev.exmohelper.model.Coins.EtheriumClassic;
import com.mannydev.exmohelper.model.Coins.Helbiz;
import com.mannydev.exmohelper.model.Coins.KickCoin;
import com.mannydev.exmohelper.model.Coins.Litecoin;
import com.mannydev.exmohelper.model.Coins.Monero;
import com.mannydev.exmohelper.model.Coins.Ripple;
import com.mannydev.exmohelper.model.Coins.Stellar;
import com.mannydev.exmohelper.model.Coins.UsdtCoin;
import com.mannydev.exmohelper.model.Coins.Waves;
import com.mannydev.exmohelper.model.Coins.ZecCoin;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by manny on 25.02.18.
 */

public class Controller implements Observer {
    Observable observable;
    ArrayList<Coin> coins;


    private Coin btc,ltc,doge,dash,eth,waves,zec,usdt,xmr,xrp,kick,etc,bch,hbz,eos,xlm;

    public Controller(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
        this.coins = new ArrayList<>();
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Exmo) {
            Exmo exmo = (Exmo) o;
            //updatePairs(exmo);
            updateCoins(exmo);
        }
    }

    private void updateCoins(Exmo exmo) {
        this.btc = new Bitcoin(exmo.getBTCUSD(),exmo.getBTCRUB(),exmo.getUSDRUB(),exmo.getBTCUAH(),exmo.getBTCEUR(),exmo.getBTCPLN(),exmo.getBTCUSDT());
        this.ltc = new Litecoin(exmo.getLTCBTC(),exmo.getLTCUSD(),exmo.getLTCRUB(),exmo.getUSDRUB(),exmo.getLTCEUR(),exmo.getBTCUSD());
        this.eth = new Etherium(exmo.getETHBTC(),exmo.getETHUSD(),exmo.getETHRUB(),exmo.getUSDRUB(),exmo.getETHUAH(),exmo.getETHEUR(),exmo.getETHPLN(),exmo.getETHUSDT(),exmo.getETHLTC(),exmo.getBTCUSD(),exmo.getLTCUSD(),exmo.getUSDTUSD());
        this.dash = new Dashcoin(exmo.getDASHBTC(),exmo.getDASHUSD(),exmo.getDASHRUB(),exmo.getUSDRUB(),exmo.getBTCUSD());
        this.bch = new BitcoinCash(exmo.getBCHBTC(),exmo.getBCHUSD(),exmo.getBCHRUB(),exmo.getUSDRUB(),exmo.getBCHETH(),exmo.getBTCUSD(),exmo.getETHUSD());
        this.xrp = new Ripple(exmo.getXRPBTC(),exmo.getXRPUSD(),exmo.getXRPRUB(),exmo.getUSDRUB(),exmo.getBTCUSD());
        this.etc = new EtheriumClassic(exmo.getETCBTC(),exmo.getETCUSD(),exmo.getETCRUB(),exmo.getUSDRUB(),exmo.getBTCUSD());
        this.xmr = new Monero(exmo.getXMRBTC(),exmo.getXMRUSD(),exmo.getXMREUR(),exmo.getBTCUSD());
        this.usdt = new UsdtCoin(exmo.getUSDTUSD(),exmo.getUSDTRUB(),exmo.getUSDRUB());
        this.waves = new Waves(exmo.getWAVESBTC(),exmo.getWAVESRUB(),exmo.getUSDRUB(),exmo.getBTCRUB());
        this.zec = new ZecCoin(exmo.getZECBTC(),exmo.getZECUSD(),exmo.getZECRUB(),exmo.getUSDRUB(),exmo.getZECEUR(),exmo.getBTCUSD());
        this.kick = new KickCoin(exmo.getKICKBTC(),exmo.getKICKETH(),exmo.getBTCUSD(),exmo.getETHUSD(),exmo.getETHBTC());
        this.doge = new Dogecoin(exmo.getDOGEBTC());
        this.hbz = new Helbiz(exmo.getHBZBTC(),exmo.getHBZUSD(),exmo.getHBZETH(),exmo.getBTCUSD(),exmo.getETHUSD());
        this.eos = new Eos(exmo.getEOSBTC(),exmo.getEOSUSD(),exmo.getBTCUSD());
        this.xlm = new Stellar(exmo.getxLMBTC(),exmo.getxLMUSD(),exmo.getxLMRUB(),exmo.getUSDRUB(),exmo.getBTCUSD());



        addCoinsToList();

    }

    private void addCoinsToList() {
        coins = new ArrayList<>();
        coins.add(btc);
        coins.add(eth);
        coins.add(ltc);
        coins.add(dash);
        coins.add(bch);
        coins.add(xrp);
        coins.add(etc);
        coins.add(xmr);
        coins.add(usdt);
        coins.add(waves);
        coins.add(zec);
        coins.add(kick);
        coins.add(doge);
        coins.add(hbz);
        coins.add(eos);
        coins.add(xlm);

    }

    public ArrayList getCoins() {
        return coins;
    }
}
