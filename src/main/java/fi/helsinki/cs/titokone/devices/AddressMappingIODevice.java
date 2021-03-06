// Copyright © 2004-2006 University of Helsinki, Department of Computer Science
// Copyright © 2012 various contributors
// This software is released under GNU Lesser General Public License 2.1.
// The license text is at http://www.gnu.org/licenses/lgpl-2.1.html

package fi.helsinki.cs.titokone.devices;

import fi.helsinki.cs.titokone.IODevice;
import fi.helsinki.cs.ttk91.TTK91RuntimeException;

/**
 * a dummy device which maps underlying device to a new address
 */
public class AddressMappingIODevice
        implements IODevice {
    protected IODevice delegate;
    protected int base;

    public AddressMappingIODevice(int base, IODevice delegate) {
        this.delegate = delegate;
        this.base = base;
        if (delegate == null || base < 0 || base > 65000) {
            throw new IllegalArgumentException("delegate must not be null");
        }
    }

    public int getPortCount() {
        return delegate.getPortCount();
    }

    public int getPort(int n)
            throws TTK91RuntimeException {
        return delegate.getPort(n - base);
    }

    public void setPort(int n, int value)
            throws TTK91RuntimeException {
        delegate.setPort(n - base, value);
    }

    public void reset() {
        delegate.reset();
    }

    public void update() {
        delegate.update();
    }
}