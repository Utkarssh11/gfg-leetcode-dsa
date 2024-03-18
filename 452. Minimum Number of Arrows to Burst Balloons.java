Leetcode - Solve today's Daily Challenge to refresh your streak!

  452. Minimum Number of Arrows to Burst Balloons

JAVA----------------------------------------------------------
  class Solution {
  public int findMinArrowShots(int[][] points) {
    Arrays.sort(points, (a, b) -> a[1] - b[1]);

    int ans = 1;
    int arrowX = points[0][1];

    for (int i = 1; i < points.length; ++i)
      if (points[i][0] > arrowX) {
        arrowX = points[i][1];
        ++ans;
      }

    return ans;
  }
}

Python--------------------------------------------------------

  class Solution:
  def findMinArrowShots(self, points: List[List[int]]) -> int:
    ans = 0
    arrowX = -math.inf

    for point in sorted(points, key=lambda x: x[1]):
      if point[0] > arrowX:
        ans += 1
        arrowX = point[1]

    return ans


  C++--------------------------------------------------------

class Solution {
 public:
  int findMinArrowShots(vector<vector<int>>& points) {
    ranges::sort(points,
                 [](const auto& a, const auto& b) { return a[1] < b[1]; });

    int ans = 1;
    int arrowX = points[0][1];

    for (int i = 1; i < points.size(); ++i)
      if (points[i][0] > arrowX) {
        arrowX = points[i][1];
        ++ans;
      }

    return ans;
  }
};

--------------------------------------------------------------
