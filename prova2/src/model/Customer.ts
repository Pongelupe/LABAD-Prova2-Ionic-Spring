import { Individual } from './Individual';
import { Account } from './Account';

export interface Customer {
  id: string;
  address: string;
  city: string;
  typeCD: string;
  fedId: string;
  postalCode: string;
  state: string;
  individual: Individual;
  accounts: Account[];
}
