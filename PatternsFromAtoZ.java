package com.te;

public class PatternsFromAtoZ {
	public static void main(String[] args) {

		System.out.println("A : ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 0 || j == 4 || i == 0 || i == 2) {
					if (i == 0 && j == 0 || i == 0 && j == 4) {
						System.out.print("  ");
					} else {
						System.out.print("* ");
					}
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("\nB : ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || i == 2 || i == 4 || j == 0 || j == 4) {
					if (i == 0 && j == 4 || i == 4 && j == 4) {
						System.out.print(" ");
					} else {
						System.out.print("* ");
					}
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("\nC : ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || i == 4 || j == 0) {
					if (i == 0 && j == 0 || i == 4 && j == 0) {
						System.out.print("  ");
					} else {
						System.out.print("* ");
					}
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("\nD : ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || i == 4 || j == 0 || j == 4) {
					if (i == 0 && j == 4 || i == 4 && j == 4) {
						System.out.print("");
					} else {

						System.out.print("* ");
					}
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("\nE : ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || i == 2 || i == 4 || j == 0) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}

		System.out.println("\nF : ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || i == 2 || j == 0) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}

		System.out.println("\nG : ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || i == 4 || j == 0 || i == 2 && j == 4 || i == 3 && j == 4 || i == 2 && j == 3
						|| i == 2 && j == 2) {
					if (i == 0 && j == 0 || i == 4 && j == 0 || i == 4 && j == 4) {
						System.out.print("  ");
					} else {
						System.out.print("* ");
					}
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("\nH : ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 2 || j == 0 || j == 4) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\nI : ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || i == 4 || j == 2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("\nJ : ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || j == 2 || i == 4 && j == 1 || i == 4 && j == 0 || i == 3 && j == 0) {
					if (i == 4 && j == 0 || i == 4 && j == 2) {
						System.out.print("  ");
					} else {
						System.out.print("* ");
					}
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\nK : ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 0 || i == 0 && j == 3 || i == 1 && j == 2 || i == 2 && j == 1 || i == 3 && j == 2
						|| i == 4 && j == 3) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("\nL : ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 4 || j == 0) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}

		System.out.println("\nM : ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 0 || j == 4 || i == 1 && j == 1 || i == 2 && j == 2 || i == 1 && j == 3) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("\nN : ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 0 || j == 4 || i == j) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("\nO : ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || i == 4 || j == 0 || j == 4) {
					if (i == 0 && j == 0 || i == 0 && j == 4 || i == 4 && j == 0 || i == 4 && j == 4) {
						System.out.print("  ");
					} else {
						System.out.print("* ");
					}
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\nP : ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 0 || i == 0 || i == 2 || i == 1 && j == 4) {
					if (i == 0 && j == 4 || i == 2 && j == 4) {
						System.out.print("  ");
					} else {
						System.out.print("* ");
					}
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("\nQ : ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 0 && i < 4 || i == 0 && j < 4 || i == 3 && j < 4 || j == 3 && i < 4 || i == 4 && j == 3
						|| i == 4 && j == 2) {
					if (i == 0 && j == 0 || i == 3 && j == 0 || i == 0 && j == 3 || i == 3 && j == 3) {
						System.out.print("  ");
					} else {
						System.out.print("* ");
					}
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("\nR : ");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 0 || i == 0 || i == 2 || i == 1 && j == 4 || i == 3 && j == 1 || i == 4 && j == 2
						|| i == 5 && j == 3) {
					if (i == 0 && j == 4 || i == 2 && j == 4) {
						System.out.print(" ");
					} else {
						System.out.print("* ");
					}
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("\nS : ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || i == 2 || i == 4 || j == 0 && i == 1 || j == 4 && i == 3) {
					if (i == 0 && j == 0 || i == 2 && j == 0 || i == 2 && j == 4 || i == 4 && j == 4) {
						System.out.print("  ");
					} else {
						System.out.print("* ");
					}

				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\nT : ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || j == 2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\nU : ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 4 || j == 0 | j == 4) {
					if (i == 4 && j == 0 || i == 4 && j == 4) {
						System.out.print("  ");
					} else {

						System.out.print("* ");
					}
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("\nV : ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 0 && i < 3 || j == 4 && i < 3 || i == 3 && j == 1 || i == 4 && j == 2 || i == 3 && j == 3) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("\nW : ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 0 || j == 4 || i == 3 && j == 1 || i == 2 && j == 2 || i == 3 && j == 3) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("\nX : ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == j || i == 0 && j == 4 || i == 1 && j == 3 || i == 3 && j == 1 || i == 4 && j == 0) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("\nY : ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == j && i < 3 && j < 3 || j == 2 && i > 2 || i == 0 && j == 4 || i == 1 && j == 3) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("\nZ : ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || i == 4 || i == 1 && j == 3 || i == 2 && j == 2 || i == 3 && j == 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}