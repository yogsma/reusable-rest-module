package com.betterjavacode.socialpie.managers;

import com.betterjavacode.socialpie.interfaces.AddressManager;
import com.betterjavacode.socialpie.models.Address;
import org.springframework.stereotype.Component;

/**
 * @Author - Yogesh Mali
 */
@Component
public class AddressManagerImpl implements AddressManager
{
    @Override
    public Address createAddress(Address address)
    {
        return null;
    }

    @Override
    public Address updateAddress(Address address)
    {
        return null;
    }

    @Override
    public Address getAddress(String guid)
    {
        return null;
    }

    @Override
    public void deleteAddress(String guid)
    {

    }
}
