package org.springframework.security.web.authentication.rememberme;

import org.springframework.security.AuthenticationException;

/**
 * @author Luke Taylor
 * @version $Id$
 */
public class RememberMeAuthenticationException extends AuthenticationException {

    public RememberMeAuthenticationException(String message) {
        super(message);
    }
}