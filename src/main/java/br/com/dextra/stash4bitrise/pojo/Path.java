package br.com.dextra.stash4bitrise.pojo;

public class Path
{
    private String extension;

    private String name;

    private String parent;

    private String toString;

    private String[] components;

    public String getExtension ()
    {
        return extension;
    }

    public void setExtension (String extension)
    {
        this.extension = extension;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getParent ()
    {
        return parent;
    }

    public void setParent (String parent)
    {
        this.parent = parent;
    }

    public String getToString ()
    {
        return toString;
    }

    public void setToString (String toString)
    {
        this.toString = toString;
    }

    public String[] getComponents ()
    {
        return components;
    }

    public void setComponents (String[] components)
    {
        this.components = components;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [extension = "+extension+", name = "+name+", parent = "+parent+", toString = "+toString+", components = "+components+"]";
    }
}
