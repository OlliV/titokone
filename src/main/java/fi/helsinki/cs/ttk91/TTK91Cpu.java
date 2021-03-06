// Copyright © 2004-2006 University of Helsinki, Department of Computer Science
// Copyright © 2012 various contributors
// This software is released under GNU Lesser General Public License 2.1.
// The license text is at http://www.gnu.org/licenses/lgpl-2.1.html

/*
 * Created on Feb 24, 2004
 */
package fi.helsinki.cs.ttk91;

/*
 * See separate documentation in yhteisapi.pdf in the javadoc root.
 */
public interface TTK91Cpu {
    public static final int CU_TR = 201;
    public static final int CU_IR = 202;
    public static final int CU_PC = 203;
    public static final int CU_PC_CURRENT = 204;
    public static final int CU_SR = 205;
    public static final int REG_R0 = 401;
    public static final int REG_R1 = 402;
    public static final int REG_R2 = 403;
    public static final int REG_R3 = 404;
    public static final int REG_R4 = 405;
    public static final int REG_R5 = 406;
    public static final int REG_R6 = 407;
    public static final int REG_R7 = 408;
    public static final int REG_SP = 407;
    public static final int REG_FP = 408;
    public static final int STATUS_STILL_RUNNING = 901;
    public static final int STATUS_SVC_SD = 902;
    public static final int STATUS_ABNORMAL_EXIT = 903;

    /**
     * @param register the register to fetch
     * @return the value stored into wanted register
     * @throws IllegalArgumentException if asked with a invalid register code
     */
    public int getValueOf(int register);

    /**
     * @return the status of the cpu as signified by STATUS_* signals
     */
    public int getStatus();
}
