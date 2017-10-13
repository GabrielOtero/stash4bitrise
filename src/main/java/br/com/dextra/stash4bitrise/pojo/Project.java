package br.com.dextra.stash4bitrise.pojo;

import com.google.gson.annotations.SerializedName;

public class Project
{
    private String id;

    private String description;

    private String name;

    private String type;

    @SerializedName("public")
    private String pub;

    private String key;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getPublic ()
    {
        return pub;
    }

    public void setPublic (String pub)
    {
        this.pub = pub;
    }

    public String getKey ()
    {
        return key;
    }

    public void setKey (String key)
    {
        this.key = key;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", description = "+description+", name = "+name+", type = "+type+", public = "+pub+", key = "+key+"]";
    }
}