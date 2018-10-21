package com.algorithm.naivebayes;

public interface IFeatureProbability<T, K> {

    /**
     * Returns the probability of a <code>feature</code> being classified as
     * <code>category</code> in the learning set.
     * 
     * @param feature
     *            the feature to return the probability for
     * @param category
     *            the category to check the feature against
     * @return the probability <code>p(feature|category)</code>
     */
    public float featureProbability(T feature, K category);

}
