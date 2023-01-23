package org.example;

import java.awt.*;

public class departement {
    public String code;
    public int faure;
    public int mayer;
    public Color color;
    public String perdant;
    public String gagnant;
    public int gagnantVoix;
    public  int perdantVoix;
    public float shareGagnant;
    public float sharePerdant;

    public departement(String code, int faure, int mayer) {
        this.code = code;
        this.faure = faure;
        this.mayer = mayer;
        if(faure<mayer){
            gagnant="Nicolas Mayer-Rossignol";
            perdant="Olivier Faure";
            gagnantVoix = mayer;
            perdantVoix = faure;
            color = new Color(0, 0, 255);
            shareGagnant = (float) (mayer)/(faure+mayer);
            sharePerdant = 1 - shareGagnant;
        }else{
            perdant="Nicolas Mayer-Rossignol";
            gagnant="Olivier Faure";
            perdantVoix = mayer;
            gagnantVoix = faure;
            color = new Color(255, 0, 0);
            shareGagnant = (float) (faure)/(faure+mayer);
            sharePerdant = 1 - shareGagnant;
        }
        setColor(shareGagnant,color);
    }
    public void setColor(float share, Color color){
        share = share ;
        int red = (int)(color.getRed() * (1 - share));
        int green = (int)(color.getGreen() * (1 - share));
        int blue = (int)(color.getBlue() * (1 - share));
        if(red<0){
            red = 0 ;
        }
        if(green<0){
            green =0;
        }
        if(blue < 0){
            blue = 0;
        }
        if(red>255){
            red = 255 ;
        }
        if(green>255){
            green =255;
        }
        if(blue > 255){
            blue = 255;
        }
        this.color = new Color(red,green,blue);
    }
    public String jsonized(){
        String str ="";
        if(gagnantVoix == 0){
            return "\"color\": \"#8A8A8A\",";
        }
        str +="\"gagnant\": \""+gagnant+"\",";
        str +="\"gVoix\": \""+((float)gagnantVoix/(gagnantVoix+perdantVoix))*100+"%\",";
        str +="\"perdant\": \""+perdant+"\",";
        str +="\"pVoix\": \""+(100-((float)gagnantVoix/(gagnantVoix+perdantVoix))*100)+"%\",";
        str +="\"color\": \""+"#"+Integer.toHexString(color.getRGB()).substring(2)+"\",";
        return str;
    }

}
