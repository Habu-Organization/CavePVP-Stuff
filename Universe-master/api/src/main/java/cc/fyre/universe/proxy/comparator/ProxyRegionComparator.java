package cc.fyre.universe.proxy.comparator;

import cc.fyre.universe.proxy.Proxy;

import java.util.Comparator;

/**
 * @author xanderume@gmail (JavaProject)
 */
public class ProxyRegionComparator implements Comparator<Proxy> {

    @Override
    public int compare(Proxy o1,Proxy o2) {
        return Integer.compare(o1.getRegion().ordinal(),o2.getRegion().ordinal());
    }

}
