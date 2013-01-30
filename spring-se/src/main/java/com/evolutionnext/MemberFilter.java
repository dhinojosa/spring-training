package com.evolutionnext;

import java.util.ArrayList;
import java.util.List;

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
