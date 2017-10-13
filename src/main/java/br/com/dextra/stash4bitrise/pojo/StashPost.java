package br.com.dextra.stash4bitrise.pojo;

import java.io.Serializable;

public class StashPost implements Serializable {
    private Repository repository;

    private RefChanges[] refChanges;

    private Changesets changesets;

    public Repository getRepository ()
    {
        return repository;
    }

    public void setRepository (Repository repository)
    {
        this.repository = repository;
    }

    public RefChanges[] getRefChanges ()
    {
        return refChanges;
    }

    public void setRefChanges (RefChanges[] refChanges)
    {
        this.refChanges = refChanges;
    }

    public Changesets getChangesets ()
    {
        return changesets;
    }

    public void setChangesets (Changesets changesets)
    {
        this.changesets = changesets;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [repository = "+repository+", refChanges = "+refChanges+", changesets = "+changesets+"]";
    }
}

