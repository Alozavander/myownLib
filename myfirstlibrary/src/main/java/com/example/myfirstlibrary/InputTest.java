package com.example.myfirstlibrary;

import android.content.Context;
import android.widget.Toast;
/*
    Author: Alozavander
 */
public class InputTest {
    private static Toast mToast;

    public static void displayInput(Context pContext, String pStr){
        mToast = Toast.makeText(pContext,pStr,Toast.LENGTH_LONG);
        mToast.show();//change
    }
}
