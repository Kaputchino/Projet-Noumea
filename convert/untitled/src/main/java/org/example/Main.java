package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    static  ArrayList<departement> listDep = new ArrayList<>();

    public static void main(String[] args) {
        listDep.add(new departement("1",15,49));
        listDep.add(new departement("2",28,38));
        listDep.add(new departement("3",45,62));
        listDep.add(new departement("4",17,26));
        listDep.add(new departement("5",19,15));
        listDep.add(new departement("6",98,76));
        listDep.add(new departement("7",36,92));
        listDep.add(new departement("8",52,31));
        listDep.add(new departement("9",20,270));
        listDep.add(new departement("10",2,17));
        listDep.add(new departement("11",297,305));
        listDep.add(new departement("12",64,60));
        listDep.add(new departement("13",729,295));
        listDep.add(new departement("14",77,41));
        listDep.add(new departement("15",2,13));
        listDep.add(new departement("16",16,45));
        listDep.add(new departement("17",36,50));
        listDep.add(new departement("18",25,39));
        listDep.add(new departement("19",29,116));
        listDep.add(new departement("21",72,133));
        listDep.add(new departement("22",51,112));
        listDep.add(new departement("23",19,77));
        listDep.add(new departement("24",52,246));
        listDep.add(new departement("25",65,63));
        listDep.add(new departement("26",114,44));
        listDep.add(new departement("27",35,56));
        listDep.add(new departement("28",17,44));
        listDep.add(new departement("29",195,205));
        listDep.add(new departement("30",105,195));
        listDep.add(new departement("31",686,590));
        listDep.add(new departement("32",108,168));
        listDep.add(new departement("33",508,358));
        listDep.add(new departement("34",117,588));
        listDep.add(new departement("35",149,144));
        listDep.add(new departement("36",74,31));
        listDep.add(new departement("37",106,28));
        listDep.add(new departement("38",75,185));
        listDep.add(new departement("39",22,17));
        listDep.add(new departement("40",486,89));
        listDep.add(new departement("41",56,11));
        listDep.add(new departement("42",108,40));
        listDep.add(new departement("43",11,159));
        listDep.add(new departement("44",298,337));
        listDep.add(new departement("45",67,95));
        listDep.add(new departement("46",37,103));
        listDep.add(new departement("47",82,35));
        listDep.add(new departement("48",11,22));
        listDep.add(new departement("49",67,49));
        listDep.add(new departement("50",57,42));
        listDep.add(new departement("51",45,24));
        listDep.add(new departement("52",47,4));
        listDep.add(new departement("53",36,24));
        listDep.add(new departement("54",129,64));
        listDep.add(new departement("55",23,29));
        listDep.add(new departement("56",65,59));
        listDep.add(new departement("57",66,153));
        listDep.add(new departement("58",93,25));
        listDep.add(new departement("59",643,516));
        listDep.add(new departement("60",190,34));
        listDep.add(new departement("61",10,23));
        listDep.add(new departement("62",706,520));
        listDep.add(new departement("63",167,120));
        listDep.add(new departement("64",163,102));
        listDep.add(new departement("65",51,110));

        listDep.add(new departement("66",34,253));
        listDep.add(new departement("67",30,97));
        listDep.add(new departement("68",47,7));
        listDep.add(new departement("69",289,204));
        listDep.add(new departement("70",46,15));

        listDep.add(new departement("71",79,56));
        listDep.add(new departement("72",40,176));
        listDep.add(new departement("73",35,26));
        listDep.add(new departement("74",15,40));
        listDep.add(new departement("75",454,644));
        listDep.add(new departement("76",115,671));
        listDep.add(new departement("77",177,144));
        listDep.add(new departement("78",106,78));

        listDep.add(new departement("79",20,25));
        listDep.add(new departement("80",78,19));
        listDep.add(new departement("81",87,184));
        listDep.add(new departement("82",54,53));
        listDep.add(new departement("83",60,47));
        listDep.add(new departement("84",82,56));
        listDep.add(new departement("85",37,39));
        listDep.add(new departement("86",66,36));
        listDep.add(new departement("87",192,275));
        listDep.add(new departement("88",6,25));
        listDep.add(new departement("89",17,15));
        listDep.add(new departement("90",0,0));

        listDep.add(new departement("91",312,48));
        listDep.add(new departement("92",149,136));
        listDep.add(new departement("93",582,108));
        listDep.add(new departement("94",373,160));
        listDep.add(new departement("95",163,229));
        listDep.add(new departement("99",101,58));
        listDep.add(new departement("971",202,12));
        listDep.add(new departement("972",24,8));
        listDep.add(new departement("973",0,0));
        listDep.add(new departement("974",41,50));
        listDep.add(new departement("975",6,3));
        listDep.add(new departement("976",0,0));
        listDep.add(new departement("986",0,0));
        listDep.add(new departement("987",0,0));
        listDep.add(new departement("988",0,0));
        listDep.add(new departement("2A",46,5));
        listDep.add(new departement("2B",20,2));

        System.out.println(listDep.get(0).color.toString());

        System.out.println(listDep.get(1).color.toString());
        System.out.println("Hello world!");
        read();
    }
    public static void read(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("dep.json"));
            String str = "";
            int x=0;
            while((str=br.readLine())!=null){
                if(x > 0 && x < 102){
                    String[] tabs = str.split("dep\":\"");
                    String s =tabs[1].split("\"")[0];
                    departement d = getDep(s);
                    System.out.println(s);
                }
                x++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static departement getDep(String nb){
        for(departement departement : listDep){
            if(departement.code.equals(nb)){
                return departement;
            }
        }
        return null;
    }
}