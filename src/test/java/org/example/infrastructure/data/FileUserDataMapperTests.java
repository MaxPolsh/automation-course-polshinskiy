package org.example.infrastructure.data;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FileUserDataMapperTests {

    private FileUserDataMapper mapper;
    User expectedUser;

    @Before
    public void setUp() {
        mapper = new FileUserDataMapper("test-users.txt");
        expectedUser = new User("1","test1@test.com","test1","1234567890");
    }

    @Test
    public void testFindUserByEmail() {
        User actualUser = mapper.findUserByEmail("test1@test.com");
        assertEquals ("Users are not equal", expectedUser,actualUser);
    }

    @Test
    public void testFindUserByUserName() {
        User actualUser = mapper.findUserByUsername("test1");
        assertEquals ("Users are not equal", expectedUser,actualUser);
    }

    @Test(expected = UserNotFoundException.class)
    public void testFindUserByNonExistingEmail() {
        mapper.findUserByEmail("bla-bla-bla");
    }

    @Test(expected = UserNotFoundException.class)
    public void testFindUserByNonExistingUsername(){
        mapper.findUserByUsername("bla-bla-bla");
    }

    @Test
    public void testGetAllTests() {
        assertEquals("Incorrect number users", 2,mapper.getAll().size());
    }

}

