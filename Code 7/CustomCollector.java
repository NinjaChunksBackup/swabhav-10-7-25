// ### 7  Custom Collector — Immutable Linked Set  *(Hard)*

// Design a reusable collector Collector<T, ?, Set<T>> toImmutableLinkedSet() that returns an unmodifiable insertion‑ordered set.

// Prove correctness by collecting the integers 1→5 twice; the result must be [1, 2, 3, 4, 5] and throw UnsupportedOperationException on mutation.

// Key concepts  → `Collector.of`, supplier / accumulator / combiner / finisher, immutability

// ---