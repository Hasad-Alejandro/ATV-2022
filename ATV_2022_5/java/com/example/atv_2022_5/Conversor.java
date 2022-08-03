package com.example.atv_2022_5;

public class Conversor {

    public double CF(double celsius){

        return (celsius*1.8)+32;
    }

    public double FC(double farenheit){

        return (farenheit-32)/1.8;

    }

    public double CK(double celsius){

        return (celsius*1.8)+273.15;
    }

    public double KC(double kelvin){

        return (kelvin-273.15)+1.8;
    }

    public double FK(double farenheit){

        return (farenheit-32)*5/9+273.15;
    }

    public double KF(double kelvin){

        return (kelvin-273.15)*9/5+32;
    }
}
