package com.github.arteam.jdbi3.strategies;

/**
 * Very simple strategy, can be used with any JDBI loader to build basic statistics.
 */
public class NaiveNameStrategy extends DelegatingStatementNameStrategy {
    public NaiveNameStrategy() {
        super(NameStrategies.CHECK_EMPTY,
              NameStrategies.NAIVE_NAME);
    }
}