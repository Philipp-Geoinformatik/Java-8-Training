package de.grashorn.java_eight_training.collections;

import java.util.List;

@FunctionalInterface
public interface ListMerger <SP, PO> {
	  List<SP> mergeWith(List<SP> list1, List<PO> list2);
}
