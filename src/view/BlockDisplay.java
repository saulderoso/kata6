package view;

import model.Block;

/**
 *
 * @author sauld
 */

public interface BlockDisplay extends Block.Observer{
    public void display(Block block);
}
