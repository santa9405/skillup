package com.kh.skillup.message.model.vo;

public class PageInfo { // 페이징 처리를 위한 값을  저장할 객체
	
	// 얻어올 값
	private int currentPage; // 페이지 번호를 저장할 변수
	private int listCount; 	 // 전체 게시글 수를 저장한 변수
	
	// 설정할 값
	private int limit = 10;	 // 한 페이지에 보여질 게시글 목록수
	private int pageSize = 5;	 // 페이징바에 표시될 페이지수
	
	// 계산할 값
	private int maxPage; 	 // 전체목록 페이지의 수 = 마지막페이지
	private int startPage; 	 // 페이징 바 시작페이지 번호
	private int endPage; 	 // 페이징 바 끝페이지 번호

	
	public PageInfo(int currentPage, int listCount) {
		super();
		this.currentPage = currentPage;
		this.listCount = listCount;
		
		// 전달받은 값과 명시적으로 선언된 값을 시용해
		// makePageInfo()수행
		makePageInfo();
	}

	public PageInfo(int currentPage, int listCount, int limit, int pageSize) {
		super();
		this.currentPage = currentPage;
		this.listCount = listCount;
		this.limit = limit;
		this.pageSize = pageSize;
		makePageInfo();
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getListCount() {
		return listCount;
	}

	public void setListCount(int listCount) {
		this.listCount = listCount;
		makePageInfo();
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
		makePageInfo();
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
		makePageInfo();
	}

	public int getMaxPage() {
		return maxPage;
	}

	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	@Override
	public String toString() {
		return "PageInfo [currentPage=" + currentPage + ", listCount=" + listCount + ", limit=" + limit + ", pageSize="
				+ pageSize + ", maxPage=" + maxPage + ", startPage=" + startPage + ", endPage=" + endPage + "]";
	}
	
	// 페이징 처리에 필요한 값을 계산하는 메소드
	private void makePageInfo() {
		// maxPage : 총 페이지 수 = 마지막 페이지
		// 총 게시글 수 : 100개, 한 페이지에 보이는 게시글 10개
		// 총 게시글 수 : 101개, 한 페이지에 보이는 게시글 11개(10.1 올림처리)
		maxPage = (int)Math.ceil((double)listCount / limit);
		
		// startPage : 페이징 바 시작번호
		// 페이징바에 페이지를 10개씩 보여줄 경우
		startPage = (currentPage-1) / pageSize * pageSize + 1;
		// endPage : 페이징 바의 끝번호
		// 페이징 바에 페이지를 10개씩 보여줄 경우
		endPage = startPage + pageSize - 1;
		if(maxPage <= endPage) {
			endPage = maxPage;
		}
	}
}
