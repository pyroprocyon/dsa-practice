package arrays;

import com.ctambaoan.arrays.GroupAnagrams;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GroupAnagramsTest {
  @Test
  void standardGroupAnagramsCase() {
    String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
    List<List<String>> result = GroupAnagrams.groupAnagrams(strs);
    assertEquals(3, result.size());
  }
}
