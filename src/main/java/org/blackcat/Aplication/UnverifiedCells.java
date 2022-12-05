package org.blackcat.Aplication;

import org.blackcat.Entity.World;

public class UnverifiedCells {

    public static void unverified(World world) {

        AxisXCell axisXCell = world.getLinealCells();
        Iterator<Cell> itr = axisXCell.getList().iterator();

        while (itr.hasNext()) {
            Cell cell = itr.next();
            cell.setVerified(false);
        }
    }
}
