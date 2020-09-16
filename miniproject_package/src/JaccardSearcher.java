//Name: Natchanon, Ananya, Nattapong
//Section: 1
//ID: 6188042, 6188084, 6188093

import java.util.List;

public class JaccardSearcher extends Searcher{

	public JaccardSearcher(String docFilename) {
		super(docFilename);
		/************* YOUR CODE HERE ******************/
		/***********************************************/	
	}
	
	@Override
	public List<SearchResult> search(String queryString, int k) {
		/************* YOUR CODE HERE ******************/
		double jaccardScore, intersect_size, union_size;
		List<SearchResult> jaccard = new ArrayList<SearchResult>();
		List<SearchResult> result = new ArrayList<SearchResult>();
	}
		
		// create set of query terms 
		Set <String> = new HashSet<String>(new ArrayList<String>(tokenize(queryString)));
		
		// loop to check jaccard similarity for all documents
		for(Document doc: this.documents){
			// set of document terms
			Set<String> doc_terms = new HashSet<>(doc.getTokens());
			Set<String> intersect = new HashSet<>(q);
			Set<String> union = new HashSet<>(q);
			
			// find intersection and union of query terms and document terms
			intersect.retainAll(doc_terms);
			union.addAll(doc_terms);
			
			// calculate jaccard similarity
			intersect_size = intersect.size():
			union_size = union.size();
			
			// add search result into the list
			jaccard.add(new SearchResult(doc, jaccardScore));
		}
		
		// sort the search result by id
		Collections.sort(jaccard);
		
		// get top k result
		for(int i=0; i<k; i++){
			result.add(jaccard.get(i));
		}
		return result;
		/***********************************************/
	}

}
