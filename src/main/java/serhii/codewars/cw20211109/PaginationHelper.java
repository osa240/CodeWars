package serhii.codewars.cw20211109;

import java.util.List;

// TODO: complete this object/class

public class PaginationHelper<I> {
  private final List<I> collection;
  private final int itemsPerPage;
  private final int indexOfPages;

  /**
   * The constructor takes in an array of items and a integer indicating how many
   * items fit within a single page
   */
  public PaginationHelper(List<I> collection, int itemsPerPage) {
    this.collection = collection;
    this.itemsPerPage = itemsPerPage;
    int division = collection.size() / itemsPerPage;
    indexOfPages = collection.size() % itemsPerPage == 0
            ? (division - 1) : division;
  }
  
  /**
   * returns the number of items within the entire collection
   */
  public int itemCount() {
    return collection.size();
  }
  
  /**
   * returns the number of pages
   */
  public int pageCount() {
    return indexOfPages + 1;
  }
  
  /**
   * returns the number of items on the current page. page_index is zero based.
   * this method should return -1 for pageIndex values that are out of range
   */
  public int pageItemCount(int pageIndex) {
      if (pageIndex < 0 || pageIndex > indexOfPages) {
          return -1;
      }
      return pageIndex == indexOfPages
            ? collection.size() - pageIndex * itemsPerPage
            : itemsPerPage;
  }
  
  /**
   * determines what page an item is on. Zero based indexes
   * this method should return -1 for itemIndex values that are out of range
   */
  public int pageIndex(int itemIndex) {
    if (itemIndex < 0 || itemIndex >= collection.size()) {
      return -1;
    }
    if (itemIndex == 0) {
      return 0;
    }
    return itemIndex % itemsPerPage == 0
            ? itemIndex / itemsPerPage - 1
            : itemIndex / itemsPerPage;
  }
}