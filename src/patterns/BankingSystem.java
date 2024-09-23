package patterns;

import java.util.HashMap;
import java.util.ArrayList;

public class BankingSystem {
	public static String[] bankingSystemQueries(String[][] queries) {
		HashMap<String, Integer> accounts = new HashMap<>();
		ArrayList<String> results = new ArrayList<>();

		for (String[] query : queries) {
			String operation = query[0];

			switch (operation) {
			case "CREATE_ACCOUNT":
				String accountId = query[1];
				if (!accounts.containsKey(accountId)) {
					accounts.put(accountId, 0);
					results.add("true");
				} else {
					results.add("false");
				}
				break;

			case "DEPOSIT":
				String depositAccountId = query[1];
				if (accounts.containsKey(depositAccountId)) {
					int depositAmount = Integer.parseInt(query[2]);
					accounts.put(depositAccountId, accounts.get(depositAccountId) + depositAmount);
					results.add(Integer.toString(accounts.get(depositAccountId)));
				} else {
					results.add("false");
				}
				break;

			default:
				results.add("");
				break;
			}
		}

		return results.toArray(new String[0]);
	}

	public static void main(String[] args) {
		String[][] queries = { { "CREATE_ACCOUNT", "1", "account1" }, { "CREATE_ACCOUNT", "2", "account2" },
				{ "DEPOSIT", "1", "2500" }, { "DEPOSIT", "1", "500" }, { "DEPOSIT", "2", "1000" } };

		String[] results = bankingSystemQueries(queries);
		for (String result : results) {
			System.out.println(result);
		}
	}
}