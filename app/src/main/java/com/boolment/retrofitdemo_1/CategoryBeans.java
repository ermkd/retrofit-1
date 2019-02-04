package com.boolment.retrofitdemo_1;

public class CategoryBeans {

    //here we keep json property name and vairbale names are same so no need to use any annotation. but we they aren't we should use annotation @Serializedname("here we have to specify json property name")


    private int category_id;
    private String category_name;
    private  String category_shop_bannerimage;
    private  String category_unique_id;


    public int getCategory_id() {
        return category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public String getCategory_shop_bannerimage() {
        return category_shop_bannerimage;
    }

    public String getCategory_unique_id() {
        return category_unique_id;
    }
}
