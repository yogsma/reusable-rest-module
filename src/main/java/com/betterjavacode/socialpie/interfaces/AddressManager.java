package com.betterjavacode.socialpie.interfaces;

import com.betterjavacode.socialpie.models.Address;

public interface AddressManager
{
    Address createAddress(Address address);

    Address updateAddress(Address address);

    Address getAddress(String guid);

    void deleteAddress(String guid);
}
