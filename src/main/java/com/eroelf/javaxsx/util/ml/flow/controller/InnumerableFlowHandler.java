package com.eroelf.javaxsx.util.ml.flow.controller;

import com.eroelf.javaxsx.util.ml.feature.Item;
import com.eroelf.javaxsx.util.ml.feature.strategy.Strategy;

/**
 * Handles the context of an modeling and scoring flow in which candidates are innumerable but are generated by {@link Strategy} instances.
 * 
 * @author weikun.zhong
 *
 * @param <T> the type of those {@link Item} instances to be processed.
 */
public interface InnumerableFlowHandler<T extends Item> extends StatisticsCalculator, StrategyHandler<T>, ScorerHandler, BatchHandler
{}