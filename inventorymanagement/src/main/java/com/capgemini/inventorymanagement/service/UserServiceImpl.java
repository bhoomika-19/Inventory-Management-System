package com.capgemini.inventorymanagement.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.inventorymanagement.dao.UserDaoImpl;
import com.capgemini.inventorymanagement.entities.Userdata;

@Service
@Transactional
public class UserServiceImpl implements UserService 
{
@Autowired
UserDaoImpl dao;

@Override
public Userdata addUser(Userdata u) {
	return dao.addUser(u);
}

@Override
public List<Userdata> getAllUsers() 
{
return dao.getAllUsers();
}


@Override
public Userdata deleteUser(int userId) 
{
	return dao.deleteUser(userId);
}

@Override
public Userdata updateUser(Userdata u) {
	return dao.updateUser(u);	
}

@Override
public Boolean loginUser(Userdata u)
{
	return dao.loginUser(u);
}
}
    
