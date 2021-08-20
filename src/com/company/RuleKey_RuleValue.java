package com.company;

public class RuleKey_RuleValue {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        String t;
        int ctr = 0;
        switch (ruleKey) {
            case "type" -> {
                for (int i = 0; i < items.size(); i++) {
                    t = items.get(i).get(0);
                    if (t.equalsIgnoreCase(ruleValue)) {
                        ctr++;
                    }
                }
                return ctr;
            }
            case "color" -> {
                for (int i = 0; i < items.size(); i++) {
                    t = items.get(i).get(1);
                    if (t.equalsIgnoreCase(ruleValue)) {
                        ctr++;
                    }
                }
                return ctr;
            }
            case "name" -> {
                for (int i = 0; i < items.size(); i++) {
                    t = items.get(i).get(2);
                    if (t.equalsIgnoreCase(ruleValue)) {
                        ctr++;
                    }
                }
                return ctr;
            }
            default -> System.out.println("Enter a valid rule key");
        }
        return 0;

    }
}
