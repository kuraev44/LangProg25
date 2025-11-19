class GenDynQueue<T> implements IGenQ<T> {
	private int putloc, getloc;
	private T[] q;
	public GenDynQueue(T[] aReF) {
		q = aReF;
		putloc = getloc = 0;
	}
	public void put(T obj) throws QueueFullException {
		if(putloc==q.length) {
	//		T[] t = new T[q.length * 2]; не компилиируется
		}
			throw new QueueFullException(q.length);
		//q[putloc++] = obj;
	}
	public T get() throws QueueEmptyException {
		if(getloc == putloc)
			throw new QueueEmptyException();
		return q[getloc++];
	}
}

