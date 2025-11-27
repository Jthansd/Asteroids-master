package org.psnbtech.entity;

import org.junit.Test;
import static org.junit.Assert.*;
public class BulletTest {
    @Test
    public void testBulletCreation(){
        Player owner = new Player();

        System.out.println("Creating a bullet with 45 degree angle");
        Bullet bullet = new Bullet(owner, 45);

        assertNotNull("Bullet should not be null", bullet);
        System.out.println("Bullet is not null");

    }


}
