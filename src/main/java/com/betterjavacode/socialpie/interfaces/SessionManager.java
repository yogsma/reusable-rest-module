package com.betterjavacode.socialpie.interfaces;

import com.betterjavacode.socialpie.models.Session;

public interface SessionManager
{
    Session createSession();

    void deleteSession();

    Session extendSession();

    Session getSession();
}
