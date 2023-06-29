package com.example.sunshop;

import com.example.sunshop.Model.Users;

public class Common {

    public static Users currentUser;

    public static String convertStatus(int number){
        switch (number){
            case 0:
                return "Chờ xác nhận";
            case 1:
                return "Xác nhận";
            case 2:
                return "Đã hủy";
            case 3:
                return "Đang giao";
            case 4:
                return "Thành công";
            default:
                return "Chờ xác nhận";
        }
    }
}
