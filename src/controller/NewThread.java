/**
 * 
 */
package controller;

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 */
public abstract class NewThread extends Thread {
	@Override
	public abstract void run();

	/**
	 * 
	 */
	public NewThread() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param target
	 * @param name
	 */
	public NewThread(Runnable target, String name) {
		super(target, name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param target
	 */
	public NewThread(Runnable target) {
		super(target);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 */
	public NewThread(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param group
	 * @param target
	 * @param name
	 * @param stackSize
	 * @param inheritThreadLocals
	 */
	public NewThread(ThreadGroup group, Runnable target, String name, long stackSize, boolean inheritThreadLocals) {
		super(group, target, name, stackSize, inheritThreadLocals);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param group
	 * @param target
	 * @param name
	 * @param stackSize
	 */
	public NewThread(ThreadGroup group, Runnable target, String name, long stackSize) {
		super(group, target, name, stackSize);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param group
	 * @param target
	 * @param name
	 */
	public NewThread(ThreadGroup group, Runnable target, String name) {
		super(group, target, name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param group
	 * @param target
	 */
	public NewThread(ThreadGroup group, Runnable target) {
		super(group, target);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param group
	 * @param name
	 */
	public NewThread(ThreadGroup group, String name) {
		super(group, name);
		// TODO Auto-generated constructor stub
	}
}
