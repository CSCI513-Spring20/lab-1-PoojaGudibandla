
public interface SortStrategy {
	public long[] sort(long number[]);
	public long getSortTime();
	public void resetTimer();
	public String strategyName();

}
