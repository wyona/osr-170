package org.wyona.yajcr;

import javax.jcr.Credentials;
import javax.jcr.LoginException;
import javax.jcr.NoSuchWorkspaceException;
import javax.jcr.Repository;
import javax.jcr.RepositoryException;
import javax.jcr.Session;

import org.apache.log4j.Category;

/**
 *
 */
public class RepositoryImpl implements Repository {

    private Category log = Category.getInstance(RepositoryImpl.class);

    /**
     *
     */
    public RepositoryImpl() {
        log.error("Initialize repository ...");
    }

    /**
     *
     */
    public Session login() throws LoginException, RepositoryException {
        return login(null, null);
    }

    /**
     *
     */
    public Session login(String workspaceName) throws LoginException, NoSuchWorkspaceException, RepositoryException {
        return login(null, workspaceName);
    }

    /**
     *
     */
    public Session login(Credentials credentials) throws LoginException, RepositoryException {
        return login(credentials, null);
    }

    /**
     *
     */
    public Session login(Credentials credentials, String workspaceName) throws LoginException, NoSuchWorkspaceException, RepositoryException {
        return null;
    }

    /**
     *
     */
    public String getDescriptor(String key) {
        return null;
    }

    /**
     *
     */
    public String[] getDescriptorKeys() {
        return null;
    }
}
