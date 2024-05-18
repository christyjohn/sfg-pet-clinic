package me.christyjohn.sfgpetclinic.services;

import me.christyjohn.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
