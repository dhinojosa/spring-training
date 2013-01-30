package com.evolutionnext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daniel Hinojosa
 * User: Daniel Hinojosa
 * Date: 11/9/11
 * Time: 1:00 PM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */
public class MemberFilter {

    private List<Member> members;

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public List<Member> getMembersFilteredByFirstName(String filteredName) {
        List<Member> result = new ArrayList<Member>();
        for (Member member: members) {
          if (member.getFirstName().startsWith(filteredName)) result.add(member);
        }
        return result;
    }
}
