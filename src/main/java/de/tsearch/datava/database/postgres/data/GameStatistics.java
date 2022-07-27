package de.tsearch.datava.database.postgres.data;

public record GameStatistics(String name, long count) implements ChartStatistics {
    @Override
    public String getLabel() {
        return name;
    }

    @Override
    public long getCount() {
        return count;
    }
}
