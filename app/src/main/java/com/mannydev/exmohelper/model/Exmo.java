
package com.mannydev.exmohelper.model;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import com.mannydev.exmohelper.model.pairs.BCHBTC;
import com.mannydev.exmohelper.model.pairs.BCHETH;
import com.mannydev.exmohelper.model.pairs.BCHRUB;
import com.mannydev.exmohelper.model.pairs.BCHUSD;
import com.mannydev.exmohelper.model.pairs.BTCEUR;
import com.mannydev.exmohelper.model.pairs.BTCPLN;
import com.mannydev.exmohelper.model.pairs.BTCRUB;
import com.mannydev.exmohelper.model.pairs.BTCUAH;
import com.mannydev.exmohelper.model.pairs.BTCUSD;
import com.mannydev.exmohelper.model.pairs.BTCUSDT;
import com.mannydev.exmohelper.model.pairs.BTCZBTC;
import com.mannydev.exmohelper.model.pairs.DASHBTC;
import com.mannydev.exmohelper.model.pairs.DASHRUB;
import com.mannydev.exmohelper.model.pairs.DASHUSD;
import com.mannydev.exmohelper.model.pairs.DOGEBTC;
import com.mannydev.exmohelper.model.pairs.ETCBTC;
import com.mannydev.exmohelper.model.pairs.ETCRUB;
import com.mannydev.exmohelper.model.pairs.ETCUSD;
import com.mannydev.exmohelper.model.pairs.ETHBTC;
import com.mannydev.exmohelper.model.pairs.ETHEUR;
import com.mannydev.exmohelper.model.pairs.ETHLTC;
import com.mannydev.exmohelper.model.pairs.ETHPLN;
import com.mannydev.exmohelper.model.pairs.ETHRUB;
import com.mannydev.exmohelper.model.pairs.ETHUAH;
import com.mannydev.exmohelper.model.pairs.ETHUSD;
import com.mannydev.exmohelper.model.pairs.ETHUSDT;
import com.mannydev.exmohelper.model.pairs.KICKBTC;
import com.mannydev.exmohelper.model.pairs.KICKETH;
import com.mannydev.exmohelper.model.pairs.LTCBTC;
import com.mannydev.exmohelper.model.pairs.LTCEUR;
import com.mannydev.exmohelper.model.pairs.LTCRUB;
import com.mannydev.exmohelper.model.pairs.LTCUSD;
import com.mannydev.exmohelper.model.pairs.USDRUB;
import com.mannydev.exmohelper.model.pairs.USDTRUB;
import com.mannydev.exmohelper.model.pairs.USDTUSD;
import com.mannydev.exmohelper.model.pairs.WAVESBTC;
import com.mannydev.exmohelper.model.pairs.WAVESRUB;
import com.mannydev.exmohelper.model.pairs.XLMBTC;
import com.mannydev.exmohelper.model.pairs.XLMRUB;
import com.mannydev.exmohelper.model.pairs.XLMUSD;
import com.mannydev.exmohelper.model.pairs.XMRBTC;
import com.mannydev.exmohelper.model.pairs.XMREUR;
import com.mannydev.exmohelper.model.pairs.XMRUSD;
import com.mannydev.exmohelper.model.pairs.XRPBTC;
import com.mannydev.exmohelper.model.pairs.XRPRUB;
import com.mannydev.exmohelper.model.pairs.XRPUSD;
import com.mannydev.exmohelper.model.pairs.ZECBTC;
import com.mannydev.exmohelper.model.pairs.ZECEUR;
import com.mannydev.exmohelper.model.pairs.ZECRUB;
import com.mannydev.exmohelper.model.pairs.ZECUSD;
import com.mannydev.exmohelper.model.pairs.HBZBTC;
import com.mannydev.exmohelper.model.pairs.HBZETH;
import com.mannydev.exmohelper.model.pairs.HBZUSD;
import com.mannydev.exmohelper.model.pairs.EOSBTC;
import com.mannydev.exmohelper.model.pairs.EOSUSD;

import java.util.Observable;

public class Exmo extends Observable {

    private static Exmo exmo;

    @SerializedName("BTC_USD")
    @Expose
    private BTCUSD bTCUSD;
    @SerializedName("BTC_EUR")
    @Expose
    private BTCEUR bTCEUR;
    @SerializedName("BTC_RUB")
    @Expose
    private BTCRUB bTCRUB;
    @SerializedName("BTC_UAH")
    @Expose
    private BTCUAH bTCUAH;
    @SerializedName("BTC_PLN")
    @Expose
    private BTCPLN bTCPLN;
    @SerializedName("BCH_BTC")
    @Expose
    private BCHBTC bCHBTC;
    @SerializedName("BCH_USD")
    @Expose
    private BCHUSD bCHUSD;
    @SerializedName("BCH_RUB")
    @Expose
    private BCHRUB bCHRUB;
    @SerializedName("BCH_ETH")
    @Expose
    private BCHETH bCHETH;
    @SerializedName("DASH_BTC")
    @Expose
    private DASHBTC dASHBTC;
    @SerializedName("DASH_USD")
    @Expose
    private DASHUSD dASHUSD;
    @SerializedName("DASH_RUB")
    @Expose
    private DASHRUB dASHRUB;
    @SerializedName("ETH_BTC")
    @Expose
    private ETHBTC eTHBTC;
    @SerializedName("ETH_LTC")
    @Expose
    private ETHLTC eTHLTC;
    @SerializedName("ETH_USD")
    @Expose
    private ETHUSD eTHUSD;
    @SerializedName("ETH_EUR")
    @Expose
    private ETHEUR eTHEUR;
    @SerializedName("ETH_RUB")
    @Expose
    private ETHRUB eTHRUB;
    @SerializedName("ETH_UAH")
    @Expose
    private ETHUAH eTHUAH;
    @SerializedName("ETH_PLN")
    @Expose
    private ETHPLN eTHPLN;
    @SerializedName("ETC_BTC")
    @Expose
    private ETCBTC eTCBTC;
    @SerializedName("ETC_USD")
    @Expose
    private ETCUSD eTCUSD;
    @SerializedName("ETC_RUB")
    @Expose
    private ETCRUB eTCRUB;
    @SerializedName("LTC_BTC")
    @Expose
    private LTCBTC lTCBTC;
    @SerializedName("LTC_USD")
    @Expose
    private LTCUSD lTCUSD;
    @SerializedName("LTC_EUR")
    @Expose
    private LTCEUR lTCEUR;
    @SerializedName("LTC_RUB")
    @Expose
    private LTCRUB lTCRUB;
    @SerializedName("ZEC_BTC")
    @Expose
    private ZECBTC zECBTC;
    @SerializedName("ZEC_USD")
    @Expose
    private ZECUSD zECUSD;
    @SerializedName("ZEC_EUR")
    @Expose
    private ZECEUR zECEUR;
    @SerializedName("ZEC_RUB")
    @Expose
    private ZECRUB zECRUB;
    @SerializedName("XRP_BTC")
    @Expose
    private XRPBTC xRPBTC;
    @SerializedName("XRP_USD")
    @Expose
    private XRPUSD xRPUSD;
    @SerializedName("XRP_RUB")
    @Expose
    private XRPRUB xRPRUB;
    @SerializedName("XMR_BTC")
    @Expose
    private XMRBTC xMRBTC;
    @SerializedName("XMR_USD")
    @Expose
    private XMRUSD xMRUSD;
    @SerializedName("XMR_EUR")
    @Expose
    private XMREUR xMREUR;
    @SerializedName("BTC_USDT")
    @Expose
    private BTCUSDT bTCUSDT;
    @SerializedName("ETH_USDT")
    @Expose
    private ETHUSDT eTHUSDT;
    @SerializedName("USDT_USD")
    @Expose
    private USDTUSD uSDTUSD;
    @SerializedName("USDT_RUB")
    @Expose
    private USDTRUB uSDTRUB;
    @SerializedName("USD_RUB")
    @Expose
    private USDRUB uSDRUB;
    @SerializedName("DOGE_BTC")
    @Expose
    private DOGEBTC dOGEBTC;
    @SerializedName("WAVES_BTC")
    @Expose
    private WAVESBTC wAVESBTC;
    @SerializedName("WAVES_RUB")
    @Expose
    private WAVESRUB wAVESRUB;
    @SerializedName("KICK_BTC")
    @Expose
    private KICKBTC kICKBTC;
    @SerializedName("KICK_ETH")
    @Expose
    private KICKETH kICKETH;
    @SerializedName("HBZ_ETH")
    @Expose
    private HBZETH hBZETH;
    @SerializedName("HBZ_BTC")
    @Expose
    private HBZBTC hBZBTC;
    @SerializedName("HBZ_USD")
    @Expose
    private HBZUSD hBZUSD;
    @SerializedName("EOS_USD")
    @Expose
    private EOSUSD eOSUSD;
    @SerializedName("EOS_BTC")
    @Expose
    private EOSBTC eOSBTC;
    @SerializedName("XLM_BTC")
    @Expose
    private XLMBTC xLMBTC;
    @SerializedName("XLM_USD")
    @Expose
    private XLMUSD xLMUSD;
    @SerializedName("XLM_RUB")
    @Expose
    private XLMRUB xLMRUB;
    @SerializedName("BTCZ_BTC")
    @Expose
    private BTCZBTC bTCZBTC;

    private void initPairs() {
        this.bTCUSD = (BTCUSD) new Pair();
        this.bTCEUR = (BTCEUR) new Pair();
        this.bTCRUB = (BTCRUB) new Pair();
        this.bTCUAH = (BTCUAH) new Pair();
        this.bTCPLN = (BTCPLN) new Pair();
        this.bCHBTC = (BCHBTC) new Pair();
        this.bCHUSD = (BCHUSD) new Pair();
        this.bCHRUB = (BCHRUB) new Pair();
        this.bCHETH = (BCHETH) new Pair();
        this.dASHBTC = (DASHBTC) new Pair();
        this.dASHUSD = (DASHUSD) new Pair();
        this.dASHRUB = (DASHRUB) new Pair();
        this.eTHBTC = (ETHBTC) new Pair();
        this.eTHLTC = (ETHLTC) new Pair();
        this.eTHUSD = (ETHUSD) new Pair();
        this.eTHEUR = (ETHEUR) new Pair();
        this.eTHRUB = (ETHRUB) new Pair();
        this.eTHUAH = (ETHUAH) new Pair();
        this.eTHPLN = (ETHPLN) new Pair();
        this.eTCBTC = (ETCBTC) new Pair();
        this.eTCUSD = (ETCUSD) new Pair();
        this.eTCRUB = (ETCRUB) new Pair();
        this.lTCBTC = (LTCBTC) new Pair();
        this.lTCUSD = (LTCUSD) new Pair();
        this.lTCEUR = (LTCEUR) new Pair();
        this.lTCRUB = (LTCRUB) new Pair();
        this.zECBTC = (ZECBTC) new Pair();
        this.zECUSD = (ZECUSD) new Pair();
        this.zECEUR = (ZECEUR) new Pair();
        this.zECRUB = (ZECRUB) new Pair();
        this.xRPBTC = (XRPBTC) new Pair();
        this.xRPUSD = (XRPUSD) new Pair();
        this.xRPRUB = (XRPRUB) new Pair();
        this.xMRBTC = (XMRBTC) new Pair();
        this.xMRUSD = (XMRUSD) new Pair();
        this.xMREUR = (XMREUR) new Pair();
        this.bTCUSDT = (BTCUSDT) new Pair();
        this.eTHUSDT = (ETHUSDT) new Pair();
        this.uSDTUSD = (USDTUSD) new Pair();
        this.uSDTRUB = (USDTRUB) new Pair();
        this.uSDRUB = (USDRUB) new Pair();
        this.dOGEBTC = (DOGEBTC) new Pair();
        this.wAVESBTC = (WAVESBTC) new Pair();
        this.wAVESRUB = (WAVESRUB) new Pair();
        this.kICKBTC = (KICKBTC) new Pair();
        this.kICKETH = (KICKETH) new Pair();
        this.hBZUSD = (HBZUSD) new Pair();
        this.hBZBTC = (HBZBTC) new Pair();
        this.hBZETH = (HBZETH) new Pair();
        this.eOSUSD = (EOSUSD) new Pair();
        this.eOSBTC = (EOSBTC) new Pair();

        this.xLMBTC = (XLMBTC) new Pair();
        this.xLMUSD = (XLMUSD) new Pair();
        this.xLMRUB = (XLMRUB) new Pair();
        this.bTCZBTC = (BTCZBTC) new Pair();

    }

    private Exmo() {
        //initPairs();
    }

    public static Exmo getInstanse(){
        if (exmo==null){
            exmo = new Exmo();
            System.out.println("Exmo создан!");
            return exmo;
        }else{
            return exmo;
        }
    }

    private void ratesChanged() {
        setChanged();
        notifyObservers();
    }

    public void refresh(String rates) {

        if(rates!=null){
            Exmo newExmo = new GsonBuilder().create().fromJson(rates, Exmo.class);
            this.bTCUSD = newExmo.getBTCUSD();
            this.bTCEUR = newExmo.getBTCEUR();
            this.bTCRUB = newExmo.getBTCRUB();
            this.bTCUAH = newExmo.getBTCUAH();
            this.bTCPLN = newExmo.getBTCPLN();
            this.bCHBTC = newExmo.getBCHBTC();
            this.bCHUSD = newExmo.getBCHUSD();
            this.bCHRUB = newExmo.getBCHRUB();
            this.bCHETH = newExmo.getBCHETH();
            this.dASHBTC = newExmo.getDASHBTC();
            this.dASHUSD = newExmo.getDASHUSD();
            this.dASHRUB = newExmo.getDASHRUB();
            this.eTHBTC = newExmo.getETHBTC();
            this.eTHLTC = newExmo.getETHLTC();
            this.eTHUSD = newExmo.getETHUSD();
            this.eTHEUR = newExmo.getETHEUR();
            this.eTHRUB = newExmo.getETHRUB();
            this.eTHUAH = newExmo.getETHUAH();
            this.eTHPLN = newExmo.getETHPLN();
            this.eTCBTC = newExmo.getETCBTC();
            this.eTCUSD = newExmo.getETCUSD();
            this.eTCRUB = newExmo.getETCRUB();
            this.lTCBTC = newExmo.getLTCBTC();
            this.lTCUSD = newExmo.getLTCUSD();
            this.lTCEUR = newExmo.getLTCEUR();
            this.lTCRUB = newExmo.getLTCRUB();
            this.zECBTC = newExmo.getZECBTC();
            this.zECUSD = newExmo.getZECUSD();
            this.zECEUR = newExmo.getZECEUR();
            this.zECRUB = newExmo.getZECRUB();
            this.xRPBTC = newExmo.getXRPBTC();
            this.xRPUSD = newExmo.getXRPUSD();
            this.xRPRUB = newExmo.getXRPRUB();
            this.xMRBTC = newExmo.getXMRBTC();
            this.xMRUSD = newExmo.getXMRUSD();
            this.xMREUR = newExmo.getXMREUR();
            this.bTCUSDT = newExmo.getBTCUSDT();
            this.eTHUSDT = newExmo.getETHUSDT();
            this.uSDTUSD = newExmo.getUSDTUSD();
            this.uSDTRUB = newExmo.getUSDTRUB();
            this.uSDRUB = newExmo.getUSDRUB();
            this.dOGEBTC = newExmo.getDOGEBTC();
            this.wAVESBTC = newExmo.getWAVESBTC();
            this.wAVESRUB = newExmo.getWAVESRUB();
            this.kICKBTC = newExmo.getKICKBTC();
            this.kICKETH = newExmo.getKICKETH();
            this.hBZUSD = newExmo.getHBZUSD();
            this.hBZBTC = newExmo.getHBZBTC();
            this.hBZETH = newExmo.getHBZETH();
            this.eOSUSD = newExmo.getEOSUSD();
            this.eOSBTC = newExmo.getEOSBTC();

            this.xLMBTC = newExmo.getxLMBTC();
            this.xLMUSD = newExmo.getxLMUSD();
            this.xLMRUB = newExmo.getxLMRUB();
            this.bTCZBTC = newExmo.getbTCZBTC();

            ratesChanged();
        }

    }

    public HBZETH getHBZETH() {
        return hBZETH;
    }

    public void sethBZETH(HBZETH hBZETH) {
        this.hBZETH = hBZETH;
    }

    public HBZBTC getHBZBTC() {
        return hBZBTC;
    }

    public void sethBZBTC(HBZBTC hBZBTC) {
        this.hBZBTC = hBZBTC;
    }

    public HBZUSD getHBZUSD() {
        return hBZUSD;
    }

    public void sethBZUSD(HBZUSD hBZUSD) {
        this.hBZUSD = hBZUSD;
    }

    public EOSUSD getEOSUSD() {
        return eOSUSD;
    }

    public void seteOSUSD(EOSUSD eOSUSD) {
        this.eOSUSD = eOSUSD;
    }

    public EOSBTC getEOSBTC() {
        return eOSBTC;
    }

    public void seteOSBTC(EOSBTC eOSBTC) {
        this.eOSBTC = eOSBTC;
    }

    public BTCUSD getBTCUSD() {
        return bTCUSD;
    }

    public void setBTCUSD(BTCUSD bTCUSD) {
        this.bTCUSD = bTCUSD;
    }

    public BTCEUR getBTCEUR() {
        return bTCEUR;
    }

    public void setBTCEUR(BTCEUR bTCEUR) {
        this.bTCEUR = bTCEUR;
    }

    public BTCRUB getBTCRUB() {
        return bTCRUB;
    }

    public void setBTCRUB(BTCRUB bTCRUB) {
        this.bTCRUB = bTCRUB;
    }

    public BTCUAH getBTCUAH() {
        return bTCUAH;
    }

    public void setBTCUAH(BTCUAH bTCUAH) {
        this.bTCUAH = bTCUAH;
    }

    public BTCPLN getBTCPLN() {
        return bTCPLN;
    }

    public void setBTCPLN(BTCPLN bTCPLN) {
        this.bTCPLN = bTCPLN;
    }

    public BCHBTC getBCHBTC() {
        return bCHBTC;
    }

    public void setBCHBTC(BCHBTC bCHBTC) {
        this.bCHBTC = bCHBTC;
    }

    public BCHUSD getBCHUSD() {
        return bCHUSD;
    }

    public void setBCHUSD(BCHUSD bCHUSD) {
        this.bCHUSD = bCHUSD;
    }

    public BCHRUB getBCHRUB() {
        return bCHRUB;
    }

    public void setBCHRUB(BCHRUB bCHRUB) {
        this.bCHRUB = bCHRUB;
    }

    public BCHETH getBCHETH() {
        return bCHETH;
    }

    public void setBCHETH(BCHETH bCHETH) {
        this.bCHETH = bCHETH;
    }

    public DASHBTC getDASHBTC() {
        return dASHBTC;
    }

    public void setDASHBTC(DASHBTC dASHBTC) {
        this.dASHBTC = dASHBTC;
    }

    public DASHUSD getDASHUSD() {
        return dASHUSD;
    }

    public void setDASHUSD(DASHUSD dASHUSD) {
        this.dASHUSD = dASHUSD;
    }

    public DASHRUB getDASHRUB() {
        return dASHRUB;
    }

    public void setDASHRUB(DASHRUB dASHRUB) {
        this.dASHRUB = dASHRUB;
    }

    public ETHBTC getETHBTC() {
        return eTHBTC;
    }

    public void setETHBTC(ETHBTC eTHBTC) {
        this.eTHBTC = eTHBTC;
    }

    public ETHLTC getETHLTC() {
        return eTHLTC;
    }

    public void setETHLTC(ETHLTC eTHLTC) {
        this.eTHLTC = eTHLTC;
    }

    public ETHUSD getETHUSD() {
        return eTHUSD;
    }

    public void setETHUSD(ETHUSD eTHUSD) {
        this.eTHUSD = eTHUSD;
    }

    public ETHEUR getETHEUR() {
        return eTHEUR;
    }

    public void setETHEUR(ETHEUR eTHEUR) {
        this.eTHEUR = eTHEUR;
    }

    public ETHRUB getETHRUB() {
        return eTHRUB;
    }

    public void setETHRUB(ETHRUB eTHRUB) {
        this.eTHRUB = eTHRUB;
    }

    public ETHUAH getETHUAH() {
        return eTHUAH;
    }

    public void setETHUAH(ETHUAH eTHUAH) {
        this.eTHUAH = eTHUAH;
    }

    public ETHPLN getETHPLN() {
        return eTHPLN;
    }

    public void setETHPLN(ETHPLN eTHPLN) {
        this.eTHPLN = eTHPLN;
    }

    public ETCBTC getETCBTC() {
        return eTCBTC;
    }

    public void setETCBTC(ETCBTC eTCBTC) {
        this.eTCBTC = eTCBTC;
    }

    public ETCUSD getETCUSD() {
        return eTCUSD;
    }

    public void setETCUSD(ETCUSD eTCUSD) {
        this.eTCUSD = eTCUSD;
    }

    public ETCRUB getETCRUB() {
        return eTCRUB;
    }

    public void setETCRUB(ETCRUB eTCRUB) {
        this.eTCRUB = eTCRUB;
    }

    public LTCBTC getLTCBTC() {
        return lTCBTC;
    }

    public void setLTCBTC(LTCBTC lTCBTC) {
        this.lTCBTC = lTCBTC;
    }

    public LTCUSD getLTCUSD() {
        return lTCUSD;
    }

    public void setLTCUSD(LTCUSD lTCUSD) {
        this.lTCUSD = lTCUSD;
    }

    public LTCEUR getLTCEUR() {
        return lTCEUR;
    }

    public void setLTCEUR(LTCEUR lTCEUR) {
        this.lTCEUR = lTCEUR;
    }

    public LTCRUB getLTCRUB() {
        return lTCRUB;
    }

    public void setLTCRUB(LTCRUB lTCRUB) {
        this.lTCRUB = lTCRUB;
    }

    public ZECBTC getZECBTC() {
        return zECBTC;
    }

    public void setZECBTC(ZECBTC zECBTC) {
        this.zECBTC = zECBTC;
    }

    public ZECUSD getZECUSD() {
        return zECUSD;
    }

    public void setZECUSD(ZECUSD zECUSD) {
        this.zECUSD = zECUSD;
    }

    public ZECEUR getZECEUR() {
        return zECEUR;
    }

    public void setZECEUR(ZECEUR zECEUR) {
        this.zECEUR = zECEUR;
    }

    public ZECRUB getZECRUB() {
        return zECRUB;
    }

    public void setZECRUB(ZECRUB zECRUB) {
        this.zECRUB = zECRUB;
    }

    public XRPBTC getXRPBTC() {
        return xRPBTC;
    }

    public void setXRPBTC(XRPBTC xRPBTC) {
        this.xRPBTC = xRPBTC;
    }

    public XRPUSD getXRPUSD() {
        return xRPUSD;
    }

    public void setXRPUSD(XRPUSD xRPUSD) {
        this.xRPUSD = xRPUSD;
    }

    public XRPRUB getXRPRUB() {
        return xRPRUB;
    }

    public void setXRPRUB(XRPRUB xRPRUB) {
        this.xRPRUB = xRPRUB;
    }

    public XMRBTC getXMRBTC() {
        return xMRBTC;
    }

    public void setXMRBTC(XMRBTC xMRBTC) {
        this.xMRBTC = xMRBTC;
    }

    public XMRUSD getXMRUSD() {
        return xMRUSD;
    }

    public void setXMRUSD(XMRUSD xMRUSD) {
        this.xMRUSD = xMRUSD;
    }

    public XMREUR getXMREUR() {
        return xMREUR;
    }

    public void setXMREUR(XMREUR xMREUR) {
        this.xMREUR = xMREUR;
    }

    public BTCUSDT getBTCUSDT() {
        return bTCUSDT;
    }

    public void setBTCUSDT(BTCUSDT bTCUSDT) {
        this.bTCUSDT = bTCUSDT;
    }

    public ETHUSDT getETHUSDT() {
        return eTHUSDT;
    }

    public void setETHUSDT(ETHUSDT eTHUSDT) {
        this.eTHUSDT = eTHUSDT;
    }

    public USDTUSD getUSDTUSD() {
        return uSDTUSD;
    }

    public void setUSDTUSD(USDTUSD uSDTUSD) {
        this.uSDTUSD = uSDTUSD;
    }

    public USDTRUB getUSDTRUB() {
        return uSDTRUB;
    }

    public void setUSDTRUB(USDTRUB uSDTRUB) {
        this.uSDTRUB = uSDTRUB;
    }

    public USDRUB getUSDRUB() {
        return uSDRUB;
    }

    public void setUSDRUB(USDRUB uSDRUB) {
        this.uSDRUB = uSDRUB;
    }

    public DOGEBTC getDOGEBTC() {
        return dOGEBTC;
    }

    public void setDOGEBTC(DOGEBTC dOGEBTC) {
        this.dOGEBTC = dOGEBTC;
    }

    public WAVESBTC getWAVESBTC() {
        return wAVESBTC;
    }

    public void setWAVESBTC(WAVESBTC wAVESBTC) {
        this.wAVESBTC = wAVESBTC;
    }

    public WAVESRUB getWAVESRUB() {
        return wAVESRUB;
    }

    public void setWAVESRUB(WAVESRUB wAVESRUB) {
        this.wAVESRUB = wAVESRUB;
    }

    public KICKBTC getKICKBTC() {
        return kICKBTC;
    }

    public void setKICKBTC(KICKBTC kICKBTC) {
        this.kICKBTC = kICKBTC;
    }

    public KICKETH getKICKETH() {
        return kICKETH;
    }

    public void setKICKETH(KICKETH kICKETH) {
        this.kICKETH = kICKETH;
    }

    public XLMBTC getxLMBTC() {
        return xLMBTC;
    }

    public void setxLMBTC(XLMBTC xLMBTC) {
        this.xLMBTC = xLMBTC;
    }

    public XLMUSD getxLMUSD() {
        return xLMUSD;
    }

    public void setxLMUSD(XLMUSD xLMUSD) {
        this.xLMUSD = xLMUSD;
    }

    public XLMRUB getxLMRUB() {
        return xLMRUB;
    }

    public void setxLMRUB(XLMRUB xLMRUB) {
        this.xLMRUB = xLMRUB;
    }

    public BTCZBTC getbTCZBTC() {
        return bTCZBTC;
    }

    public void setbTCZBTC(BTCZBTC bTCZBTC) {
        this.bTCZBTC = bTCZBTC;
    }
}
