package com.example.amiverse;

import android.content.Context;
import android.content.SharedPreferences;

public class User
{
    SharedPreferences sharedPreferences;

    public void removeUser()
    {
        sharedPreferences.edit().clear().commit();
    }
    public String getName() {
        name=sharedPreferences.getString("userdata","");
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
        sharedPreferences.edit().putString("userdata",name).commit();
    }

    private String name;
    Context context;
    public User(Context context)
    {
        this.context=context;
        sharedPreferences=context.getSharedPreferences("userinfo",Context.MODE_PRIVATE);

    }
}
