package com.mannydev.exmohelper.view;

import android.view.View;
import android.widget.TextView;

import com.mannydev.exmohelper.R;
import com.mannydev.exmohelper.model.Coin;


public class DogecoinViewHolder extends MyViewHolder {
    TextView txtCoinName, txtBtcBuy, txtBtcSell, txtBtcSprd;

    public DogecoinViewHolder(View itemView) {
        super(itemView);
        txtCoinName = itemView.findViewById(R.id.txtCoinName);

        txtBtcBuy = itemView.findViewById(R.id.txtBtcBuy);
        txtBtcSell = itemView.findViewById(R.id.txtBtcSell);
        txtBtcSprd = itemView.findViewById(R.id.txtBtcSprd);
    }

    @Override
    public void onBindCoinHolder(Coin coin) {
        txtCoinName.setText(coin.getName());

        txtBtcBuy.setText(String.valueOf(coin.getBtcBuy()));
        txtBtcSell.setText(String.valueOf(coin.getBtcSell()));
        txtBtcSprd.setText(String.valueOf(coin.getBtcSpread()));
    }
}
